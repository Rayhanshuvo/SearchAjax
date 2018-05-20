$( document ).ready(function() {
	
	// GET REQUEST
	$("#getAllCustomerId").click(function(event){
		event.preventDefault();
		
		var person = {};
		var name = $("#inputSerach").val();
		
		
		ajaxGet(name);
	});

	// DO GET
	function ajaxGet(name){
	alert("before ajax");
		$.ajax({	
			type : "GET",
			contentType : "application/json",
			url :"getDefectCount",
			data : "name=" + name,
			dataType : 'json',	
			
			success: function(data){
				alert("Succse");
				var document = '';
				if(data != ""){
					alert("Done");
					$('#list-group tr').empty();
					var document = "";
					$.each(data, function(i, document){
						
						document+='<tr><td>' + document.name + '</td><td>' + document.trackId + '</td></tr>';
						
						$('#list-group').append(document)
			        });
					
					console.log("Success: ", data);
				}else{
					alert("rlse");
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("Fail: ", data);
				}
			},
			error : function(e) {
				alert("rlstte");
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
	
	
		
})