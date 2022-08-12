function setComma(number) {
    return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function setOnlyNumber(input){
    input.value = setComma(input.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1'));
}

// 휴대폰번호 및 전화번호 하이픈 적용
function phoneFomatter(num,type){
    let formatNum = '';

    if(num.length===11){
        if(type===0){
            formatNum = num.replace(/(\d{3})(\d{4})(\d{4})/, '$1-****-$3');
        }else{
            formatNum = num.replace(/(\d{3})(\d{4})(\d{4})/, '$1-$2-$3');
        }
    }else if(num.length===8){
        formatNum = num.replace(/(\d{4})(\d{4})/, '$1-$2');
    }else{
        if(num.indexOf('02')==0){
            if(type===0){
                formatNum = num.replace(/(\d{2})(\d{4})(\d{4})/, '$1-****-$3');
            }else{
                formatNum = num.replace(/(\d{2})(\d{4})(\d{4})/, '$1-$2-$3');
            }
        }else{
            if(type===0){
                formatNum = num.replace(/(\d{3})(\d{3})(\d{4})/, '$1-***-$3');
            }else{
                formatNum = num.replace(/(\d{3})(\d{3})(\d{4})/, '$1-$2-$3');
            }
        }
    }

    return formatNum;
}

function millisecondsToDate(milliseconds){
    let date = new Date(milliseconds);
    let year = date.getFullYear();
    let month = (date.getMonth() + 1).toString().length === 1 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1);
    let day = date.getDate().toString().length === 1 ? "0" + date.getDate() : date.getDate();
    return year + "." + month + "." + day;
}


$(document).ready(function(){
    let nowPage = window.location.pathname;
    let exceptionPage = [
        "/pt/coach_join_step1",
        "/pt/coach_join_step2",
        "/pt/coach_join_step3"
    ];

    if(!exceptionPage.includes(nowPage)){
        if(token === ""){
            location.href = "/pt/login";
        }
    }

    // select 박스 처리
    $.fn.selectBoxSet = function() {
        $("select").each(function (index, item) {
            let placeholder = $(item).find("option[value='']").text();
            $(item).css("display", "none");
            $(item).after("<div class='select-box " + $(this).attr("name") + "-select'><div class='current-select'>" + placeholder + "</div><div class='select-list'></div></div>");

            let currentSelect = $(item).next().children().first();
            let selectList = $(item).next().children().last();

            for (let i = 0; i < $(item).children().length; i++) {
                let optionText = $(item).children().eq(i).text();

                selectList.append("<span>" + optionText + "</span>");
            }
            // selectList.css("bottom", "-" + (Number(selectList.css("height").replace('px', '')) + 20) + "px");

            currentSelect.click(function () {
                if (selectList.css("display") === "block") {
                    selectList.css("display", "none");
                } else {
                    $("div.selcet-list").css("display", "none");
                    selectList.css("display", "block");
                }
            });

            if ($(item).children("option:selected")) {
                currentSelect.addClass("selected");
                currentSelect.text(($(item).children("option:selected").text()));
            }

            selectList.children().click(function () {
                currentSelect.addClass("selected");
                currentSelect.text(($(this).text()));
                $(item).children().eq($(this).index()).prop("selected", true);
                selectList.css("display", "none");
            });
        });
    }

    $.fn.selectBoxDelete = function(){
        $("select").each(function(index, item){
            $(item).next("div.select-box").remove();
        });
    }

    // $.fn.selectBoxSet();

});