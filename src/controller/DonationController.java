package controller;


import dao.DonationDao;
import model.DonationModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SendEmail;

import javax.annotation.Resource;

@Controller
@Scope("request")
@RequestMapping("/api/donations")
public class DonationController {

    @Resource
    private SendEmail sendEmail;

    @Resource
    private DonationDao donationDao;

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(DonationModel model) {
        sendMailIfNeed(model);
        donationDao.createDonation(model);
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(DonationModel model) {
        sendMailIfNeed(model);
        donationDao.updateDonation(model);
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(DonationModel model) {
        donationDao.deleteDonation(model);
    }

    private void sendMailIfNeed(DonationModel model) {
        if (model.getSum() > 10000.0) {
            sendEmail.sendMail("michal7010@gmail.com");
        }
    }

}


