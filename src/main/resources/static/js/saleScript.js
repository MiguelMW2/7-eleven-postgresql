$(function() {
	$("#searchProduct").click(function () {
		let name = $("#name").val();
		let upc = $("#upc").val();
		let idSale = $("#idSale").val();
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "/rest/product/search/" + name + "/" + upc,
			dataType : 'json',
			success : function(result) {
				$("#products").empty();
				$.each(result, function (index, product) {
					let table = "<tr>";
					table += "<td>" + product.name + "</td>";
					table += "<td>" + product.description + "</td>";
					table += "<td>" + product.price + "</td>";
					table += "<td>" + product.stock + "</td>";
					table += "<td>" + product.upc + "</td>";
					table += "<td><button onclick='selectProduct(" + idSale + "," + JSON.stringify(product) + ")'>" + "Seleccionar" + "</button></td>";
					table += "</tr>";
					$("#products").append(table);
					$("#products td button").addClass("btn btn-danger w-100");
				});
			},
			error : function(e) {
				alert("No se encontraron productos");
			}
		});	
	});

	selectProduct = function (idSale, product) {
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/rest/detailSale/save",
			data : JSON.stringify({
				"sales" : { "id": idSale },
				"products" : product
			}),
			dataType : 'json',
			success : function(result) {
				if(!($("tbody#selectedProducts tr#" + result.products.id).length > 0)) {
					let table = "<tr id='" + result.products.id + "'>";
					table += "<td>" + result.products.name + "</td>";
					table += "<td>" + result.products.description + "</td>";
					table += "<td>" + result.products.price + "</td>"
					table += "<td class='quantity'>" + result.quantityProduct + "</td>"
					table += "</tr>";
					$("#selectedProducts").append(table);
				}
				else {
					$("#selectedProducts tr#" + result.products.id + " td.quantity").text(result.quantityProduct);
				}
			},
			error : function(e) {
				alert("Error!");
			}
		});
	}
});
