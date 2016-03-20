package com.fund.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fund.service.ValidCodeService;

/**
 * @author:gjh
 * @Description:验证码controller
 * @date:2015年8月13日 上午9:54:16
 */
@Controller
@RequestMapping("/code")
public class ValidImageController {
	
	@Autowired
	private ValidCodeService validCodeService;
	
	private static char[] alphas = new char[36];

    static {
        for (int i = 0; i < 10; i++) {
            alphas[i] = (char) ('0' + i);
        }

        /*for (int i = 0; i < 26; i++) {
            alphas[i + 10] = (char) ('A' + i);
        }*/

        for (int i = 0; i < 26; i++) {
            alphas[i + 10] = (char) ('a' + i);
        }
    }
	
    @RequestMapping
	public void getValidImage(HttpServletRequest request, HttpServletResponse response,HttpSession session) 
			throws Exception{
		response.setContentType("image/jpeg");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        int width = 90, height = 35;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        Random random = new Random();
        g.setColor(/*getRandColor(200, 250)*/new Color(249, 252, 124));
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        g.setColor(/*getRandColor(160, 200)*/new Color(134, 150, 242));
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(30);
            int yl = random.nextInt(30);
            g.drawLine(x, y, x + xl, y + yl);
        }

        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(alphas.length);
            sb.append(alphas[index]);
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random
                    .nextInt(110)));
            g.drawString(String.valueOf(alphas[index]), 20 * i + 6, 26);
        }
        g.dispose();

        validCodeService.recordValidCode(sb.toString(),session);
        OutputStream toClient = response.getOutputStream();
        ImageIO.write(image, "jpeg", toClient);
        toClient.close();
	}

}
