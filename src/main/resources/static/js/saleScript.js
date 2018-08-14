$(function() {
	searchProduct = function () {
		let name = $("#name").val();
		let upc = $("#upc").val();
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "/rest/product/search/" + name + "/" + upc,
			dataType : 'json',
			success : function(result) {
				$("#products").empty();
				$.each(result, function (index, element) {
					$("#products").append( "<tr>" );
					$("#products").append( "<td>" + element.name + "</td>" );
					$("#products").append( "<td>" + element.description + "</td>" );
					$("#products").append( "<td>" + element.price + "</td>" );
					$("#products").append( "<td>" + element.stock + "</td>" );
					$("#products").append( "<td>" + element.upc + "</td>" );
					$("#products").append( "<td><button onclick='selectProduct(" + element.id + ")'>" + "Seleccionar" + "</button></td>" );
					$("#products").append( "</tr>" );
				});
			},
			error : function(e) {
				alert("No se encontraron productos");
			}
		});	
	}

	selectProduct = function (id) {
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "/rest/product/search/" + id,
			dataType : 'json',
			success : function(result) {
				$("#selectedProducts").append( "<tr>" );
				$("#selectedProducts").append( "<td>" + result.name + "</td>" );
				$("#selectedProducts").append( "<td>" + result.description + "</td>" );
				$("#selectedProducts").append( "<td>" + result.price + "</td>" );
				$("#selectedProducts").append( "<td>" +  + "</td>" );
				$("#selectedProducts").append( "</tr>" );
			},
			error : function(e) {
				alert("Error!");
			}
		});
	}
});
