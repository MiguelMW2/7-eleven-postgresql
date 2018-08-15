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
					$("#products").append( "<tr>" );
					$("#products").append( "<td>" + product.name + "</td>" );
					$("#products").append( "<td>" + product.description + "</td>" );
					$("#products").append( "<td>" + product.price + "</td>" );
					$("#products").append( "<td>" + product.stock + "</td>" );
					$("#products").append( "<td>" + product.upc + "</td>" );
					$("#products").append( "<td><button onclick='selectProduct(" + idSale + "," + product.id + ")'>" + "Seleccionar" + "</button></td>" );
					$("#products").append( "</tr>" );
				});
			},
			error : function(e) {
				alert("No se encontraron productos");
			}
		});	
	});

	selectProduct = function (idSale, idProduct) {
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/rest/detailSale/save",
			data : JSON.stringify({
				"sales" : { "id": idSale },
				"products" : { "id" : idProduct }
			}),
			dataType : 'json',
			success : function(result) {
				/*
				$("#selectedProducts").append( "<tr>" );
				$("#selectedProducts").append( "<td>" + result.name + "</td>" );
				$("#selectedProducts").append( "<td>" + result.description + "</td>" );
				$("#selectedProducts").append( "<td>" + result.price + "</td>" );
				$("#selectedProducts").append( "<td>" +  + "</td>" );
				$("#selectedProducts").append( "<td><button onclick='deleteProduct(" + element.id + ")'>" + "Eliminar" + "</button></td>" );
				$("#selectedProducts").append( "</tr>" );
				*/
				console.log(result);
			},
			error : function(e) {
				alert("Error!");
			}
		});
	}
});
