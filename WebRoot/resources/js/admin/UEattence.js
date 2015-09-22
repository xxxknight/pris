$(function() {
	
	$("#btnSave").click(function(){
		$.post("updateArticle", {
			"article.id": "1",
			"article.title": "请勤制度",
			"article.createPeople": "xxxknight",
			"article.updateTime": "2015-07-15",
			"article.remark": "本文仅限BUPT-PRIS-727使用。",
		    "article.content": ue.getContent(),
		},

		function(data) {
			alert("保存成功");
		});
	})
	
	

});