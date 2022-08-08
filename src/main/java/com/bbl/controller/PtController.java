package com.bbl.controller;

import com.bbl.service.PtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("/pt")
@Controller
public class PtController {
    Logger logger = LoggerFactory.getLogger(PtController.class);

    private final PtService ptService;


    public PtController(PtService ptService) {
        this.ptService = ptService;
    }

    @RequestMapping("")
    public String index(HttpSession session){
        logger.info("pt/index");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/login";
        }

        return "view/pt/mypage";
    }

    @RequestMapping("/*")
    public String index2nd(HttpSession session){
        logger.info("pt/index");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/login";
        }

        return "view/pt/mypage";
    }

    @RequestMapping("/index")
    public String index3rd(HttpSession session){
        logger.info("pt/index");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/login";
        }

        return "view/pt/mypage";
    }


    @RequestMapping("/mypage")
    public String mypage(HttpSession session){
        logger.info("pt/mypage");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/login";
        }

        return "view/pt/mypage";
    }

    @RequestMapping("/login")
    public String login(){
        logger.info("pt/login");

        return "view/pt/login";
    }

    @RequestMapping("/coach_join_step1")
    public String coach_join_step1(HttpSession session){
        logger.info("pt/coach_join_step1");

        return "view/pt/coach_join_step1";
    }

    @RequestMapping("/coach_join_step2")
    public String coach_join_step2(HttpSession session){
        logger.info("pt/coach_join_step2");

        return "view/pt/coach_join_step2";
    }

    @RequestMapping("/coach_join_step3")
    public String coach_join_step3(HttpSession session){
        logger.info("pt/coach_join_step3");

        return "view/pt/coach_join_step3";
    }

    @RequestMapping("/search_center")
    public String search_center(HttpSession session){
        logger.info("pt/search_center");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/search_center";
    }

    @RequestMapping("/join_success")
    public String join_success(HttpSession session){
        logger.info("pt/join_success");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/join_success";
    }

    @RequestMapping("/coach_profile")
    public String coach_profile(HttpSession session){
        logger.info("pt/coach_profile");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/coach_profile";
    }

    @RequestMapping("/tab_cont_trainer")
    public String tab_cont_trainer(){
        logger.info("pt/tab_cont_trainer");

        return "view/pt/tab_cont_trainer";
    }

    @RequestMapping("/tab_cont_center")
    public String tab_cont_center(){
        logger.info("pt/tab_cont_center");

        return "view/pt/tab_cont_center";
    }

    @RequestMapping("/tab_cont_review")
    public String tab_cont_review(){
        logger.info("pt/tab_cont_review");

        return "view/pt/tab_cont_review";
    }

    @RequestMapping("/set_one_time")
    public String set_one_time(HttpSession session){
        logger.info("pt/set_one_time");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_one_time";
    }

    @RequestMapping("/menu")
    public String menu(HttpSession session){
        logger.info("pt/menu");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/menu";
    }

    @RequestMapping("/edit_myinfo")
    public String edit_myinfo(HttpSession session){
        logger.info("pt/edit_myinfo");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/edit_myinfo";
    }

    @RequestMapping("/change_phone")
    public String change_phone(HttpSession session){
        logger.info("pt/change_phone");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/change_phone";
    }

    @RequestMapping("/change_password")
    public String change_password(HttpSession session){
        logger.info("pt/change_password");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/change_password";
    }

    @RequestMapping("/change_center")
    public String change_center(HttpSession session){
        logger.info("pt/change_center");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/change_center";
    }

    @RequestMapping("/set_fee")
    public String set_fee(HttpSession session){
        logger.info("pt/set_fee");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_fee";
    }

    @RequestMapping("/set_trainer_photo")
    public String set_trainer_photo(HttpSession session){
        logger.info("pt/set_trainer_photo");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_trainer_photo";
    }

    @RequestMapping("/set_trainer_info")
    public String set_trainer_info(HttpSession session){
        logger.info("pt/set_trainer_info");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_trainer_info";
    }

    @RequestMapping("/trainer_qualification_li")
    public String trainer_qualification_li(){
        logger.info("pt/trainer_qualification_li");

        return "view/pt/trainer_qualification_li";
    }

    @RequestMapping("/set_buy_info")
    public String set_buy_info(HttpSession session){
        logger.info("pt/set_buy_info");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_buy_info";
    }

    @RequestMapping("/manage_member_schedule")
    public String manage_member_schedule(HttpSession session){
        logger.info("pt/manage_member_schedule");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/manage_member_schedule";
    }

    @RequestMapping("/manage_member")
    public String manage_member(HttpSession session){
        logger.info("pt/manage_member");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/manage_member";
    }

    @RequestMapping("/manage_schedule")
    public String manage_schedule(HttpSession session){
        logger.info("pt/manage_schedule");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/manage_schedule";
    }

    @RequestMapping("/record_exercise")
    public String record_exercise(HttpSession session){
        logger.info("pt/record_exercise");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/record_exercise";
    }

    @RequestMapping("/record_individual")
    public String record_individual(HttpSession session){
        logger.info("pt/record_individual");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/record_individual";
    }

    @RequestMapping("/record_inbody")
    public String record_inbody(HttpSession session){
        logger.info("pt/record_inbody");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/record_inbody";
    }

    @RequestMapping("/record_calorie")
    public String record_calorie(HttpSession session){
        logger.info("pt/record_calorie");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/record_calorie";
    }

    @RequestMapping("/scheduled_exercise")
    public String scheduled_exercise(HttpSession session){
        logger.info("pt/scheduled_exercise");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/scheduled_exercise";
    }

    @RequestMapping("/regist_ex_schedule")
    public String regist_ex_schedule(HttpSession session){
        logger.info("pt/regist_ex_schedule");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/regist_ex_schedule";
    }

    @RequestMapping("/regist_ex")
    public String regist_ex(HttpSession session){
        logger.info("pt/regist_ex");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/regist_ex";
    }

    @RequestMapping("/modify_ex_schedule")
    public String modify_ex_schedule(HttpSession session){
        logger.info("pt/modify_ex_schedule");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/modify_ex_schedule";
    }

    @RequestMapping("/modify_schedule_section")
    public String modify_schedule_section(HttpSession session){
        logger.info("pt/modify_schedule_section");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/modify_schedule_section";
    }

    @RequestMapping("/modify_ex_section")
    public String modify_ex_section(HttpSession session){
        logger.info("pt/modify_ex_section");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/modify_ex_section";
    }

    @RequestMapping("/manage_adjust")
    public String manage_adjust(HttpSession session){
        logger.info("pt/manage_adjust");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/manage_adjust";
    }

    @RequestMapping("/set_adjust")
    public String set_adjust(HttpSession session){
        logger.info("pt/set_adjust");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/set_adjust";
    }

    @RequestMapping("/notification")
    public String notification(HttpSession session){
        logger.info("pt/notification");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/notification";
    }

    @RequestMapping("/settings")
    public String settings(HttpSession session){
        logger.info("pt/settings");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/settings";
    }

    @RequestMapping("/qna")
    public String qna(HttpSession session){
        logger.info("pt/qna");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/qna";
    }

    @RequestMapping("/inquiry")
    public String inquiry(HttpSession session){
        logger.info("pt/inquiry");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/inquiry";
    }

    @RequestMapping("/notice")
    public String notice(HttpSession session){
        logger.info("pt/notice");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/notice";
    }

    @RequestMapping("/article_detail")
    public String article_detail(HttpSession session){
        logger.info("pt/article_detail");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/article_detail";
    }

    @RequestMapping("/terms")
    public String terms(HttpSession session){
        logger.info("pt/terms");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/terms";
    }

    @RequestMapping("/resign_user")
    public String resign_user(HttpSession session){
        logger.info("pt/resign_user");

        if(session.getAttribute("token")==null){
            return "redirect:/pt/index";
        }

        return "view/pt/resign_user";
    }

}
