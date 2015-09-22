$(function() {
	$.ajax({
		url : "statsTravel",
		type : 'post',
		data : {
		},
		dataType : "json",
		timeout : 15000,
		success : function(data, textStatus) {
//				alert(data);
//				alert(data['people']);
//				alert(data['number']);
				window.arr_people=data['people'];
				window.arr_number=data['number'];
				window.arr_people2=data['people2'];
				window.arr_number2=data['number2'];
				$.getScript('resources/js/ecTravel.js', {}, function() {
				});
		},
	});
})

function transform(obj){
    var arr = [];
    for(var item in obj){
        arr.push(obj[item]);
    }
    return arr;
}