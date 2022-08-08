$(document).ready(function(){
    // 디바이스별 container 최소 높이 설정 (디바이스 높이 - header태그 높이)
    let window_height = $(window).outerHeight();
    let header_height = $("header").outerHeight();

    $("div.container").css("min-height", window_height - header_height);
});

// 비밀번호 보이기
function showPassword(btn){
    let input = btn.previousElementSibling;
    if(input.type === "text"){
        input.type = "password";
        btn.classList.remove("active");
    }else{
        input.type = "text";
        btn.classList.add("active");
    }
}
