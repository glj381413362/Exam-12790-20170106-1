(function($, global) {
	$(document).ready(function() {
		totalRecordNum = 21// 总记录条数(从java程序中获取)
		currentPageNumber = 1;// 当前页号
		// if (totalRecordNum == 0) {
		// currentPageNumber = 0;
		// }
		perPageRecordNum = Number($('#pageSize').val());// 每页记录条数(js中设置)
		// 计算总页数
		totalPageNumber = Math.ceil(totalRecordNum / perPageRecordNum);

		var initQueryInfo = {
			filmId : 0,
			filmTitle : "",
			page : 1,
			pageSize : 10
		};
		query(initQueryInfo);
		exeShowPage();
		$("#firstPage").on({
			click : function() {
				goToFirstPage();// 跳转到第一页
				$('#query').click();
			}
		});
		$("#lastPage").on({
			click : function() {
				goToLastPage();// 跳转到最后一页
				$('#query').click();
				exeShowPage();
			}
		});
		$('#go').click(function() {
			goToPage(Number($('#page').val()));
			$('#query').click();
		});

		// 上一页事件
		$('#beforePage').click(function() {
			if ($('#beforePage').attr("href") != null) {
				goToBeforePage();
				$('#query').click();
			}
		});

		// 下一页事件
		$('#nextPage').click(function() {
			if ($('#nextPage').attr("href") != null) {
				goToNextPage();
				$('#query').click();
			}

		});

		$('#page1').click(function() {
			if ($('#page1').attr("href") != null) {
				currentPageNumber = $("#page1").text();
				$('#query').click();
				exeShowPage();
			}
		});
		$('#page2').click(function() {
			if ($('#page2').attr("href") != null) {
				currentPageNumber = $("#page2").text();
				$('#query').click();
				exeShowPage();
			}
		});
		$('#page3').click(function() {
			if ($('#page3').attr("href") != null) {
				currentPageNumber = $("#page3").text();
				$('#query').click();
				exeShowPage();
			}
		});
		$('#page4').click(function() {
			if ($('#page4').attr("href") != null) {
				currentPageNumber = $("#page4").text();
				$('#query').click();
				exeShowPage();
			}
		});
		$('#query').click(function() {
			query({
				firstName : $('#firstname').val(),
				lastName : $('#lastname').val()
			});
		});
		$("#pageSize").change(function() {
			$("#page").val(1);
			perPageRecordNum = Number($("#pageSize option:selected").val());// 每页记录条数(js中设置)
			totalPageNumber = Math.ceil(totalRecordNum / perPageRecordNum) - 1;
			$("#lastPage").text(totalPageNumber);
			$('#query').click();
			exeShowPage();

		});
		$('#filmTitle').bind('input propertychange', function() {
			$('#query').click();
			exeShowPage();
		});
	});
	function goToBeforePage() {
		if (totalRecordNum != 0) {
			if (currentPageNumber > 1) {
				currentPageNumber = currentPageNumber - 1;
				if (($("#page1").text()) > 2) {// 改变页码显示
					var t = new Number($("#page1").text());
					$("#page1").text(new Number($("#page1").text()) - 1);
					$("#page2").text(new Number($("#page2").text()) - 1);
					$("#page3").text(new Number($("#page3").text()) - 1);
					$("#page4").text(new Number($("#page4").text()) - 1);
					// 判断是否存在当前页码是否存在
				}
				exeShowPage();
			} else {
				alert("当前页已经是第一页了!");
			}
		}
	}
	function goToNextPage() {
		if (totalRecordNum != 0) {
			if (currentPageNumber < totalPageNumber) {
				currentPageNumber = (new Number(currentPageNumber)) + 1;
				if (($("#page4").text()) == currentPageNumber - 1) {// 改变页码显示
					var t = new Number($("#page1").text());
					$("#page1").text(t + 1);
					$("#page2").text(t + 2);
					$("#page3").text(t + 3);
					$("#page4").text(t + 4);
				}
				exeShowPage();
			} else {
				alert("当前页已经是最后一页了!");
			}
		}
	}
	// 跳到指定页
	function goToPage(pageNum) {
		if (totalRecordNum != 0) {
			// 跳转到指定页
			currentPageNumber = pageNum;
			if (pageNum < 6) {
				$("#page1").text(2);
				$("#page2").text(3);
				$("#page3").text(4);
				$("#page4").text(5);
			} else {
				$("#page1").text(currentPageNumber);
				$("#page2").text(currentPageNumber + 1);
				$("#page3").text(currentPageNumber + 2);
				$("#page4").text(currentPageNumber + 3);
			}
			exeShowPage();
		}
	}
	// 跳转到第一页
	function goToFirstPage() {
		if (totalRecordNum != 0) {
			currentPageNumber = 1;
			$("#page1").text(2);
			$("#page2").text(3);
			$("#page3").text(4);
			$("#page4").text(5);
			exeShowPage();
		}
	}
	function goToLastPage() {
		if (totalRecordNum != 0) {
			currentPageNumber = totalPageNumber;
			if (totalPageNumber < 6) {
				$("#page1").text(2);
				$("#page2").text(3);
				$("#page3").text(4);
				$("#page4").text(5);
			} else {
				$("#page1").text(totalPageNumber - 3);
				$("#page2").text(totalPageNumber - 2);
				$("#page3").text(totalPageNumber - 1);
				$("#page4").text(totalPageNumber);
			}
			exeShowPage();
		}
	}

	function exeShowPage() {
		for (var i = 1; i < 5; i++) {
			var temp = "#page" + i;
			if ($(temp).text() > totalPageNumber) {
				$(temp).attr({
					"title" : "无效页码",
					"style" : "opacity:0.2"
				});
				$(temp).removeAttr("href");
			} else {
				$(temp).attr({
					"href" : "#",
					"title" : "页码",
					"style" : "opacity:1"
				});
			}
		}
		if (currentPageNumber == 1) {
			$("#beforePage").attr({
				"title" : "已是第一页",
				"style" : "opacity:0.2"
			});
			$("#beforePage").removeAttr("href");
		} else {
			$("#beforePage").attr({
				"href" : "#",
				"title" : "第一页",
				"style" : "opacity:1"
			});
		}
		if (currentPageNumber == totalPageNumber) {
			$("#nextPage").attr({
				"title" : "已是最后一页",
				"style" : "opacity:0.2"
			});
			$("#nextPage").removeAttr("href");
		} else {
			$("#nextPage").attr({
				"href" : "#",
				"title" : "最后一页",
				"style" : "opacity:1"
			});
		}
	}
}(jQuery, window))