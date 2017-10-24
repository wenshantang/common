package cn.aresoft.fhcf.common.util;



import java.io.File;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

/**
 * 邮件发送类
 * 
 * @author qinyao
 */
public class MailSenderUtil {
	private static ResourceBundle bundle = ResourceBundle.getBundle("sysconfig");
	private static final String charset = "utf-8";
	private static final String defaultMimetype = "text/html";
	private static String fromAddress = bundle.getString("user");
	private static String fromName = bundle.getString("name");
	private static String mailAccount = bundle.getString("user");
	private static String Password = bundle.getString("password");
	private static String smtpHost = bundle.getString("smtp");

	/**
	 * 单个邮件发送
	 * 
	 * @param receiver
	 *            收件人
	 * @param subject
	 *            标题
	 * @param mailContent
	 *            邮件内容
	 */
	public static int send(String receiver, String subject, String mailContent) {
		if (receiver != null && !receiver.equals("")) {
			return send(new String[] { receiver }, subject, mailContent);
		}
		return 1;
	}

	/**
	 * 批量邮件发送
	 * 
	 * @param receivers
	 *            收件人
	 * @param subject
	 *            标题
	 * @param mailContent
	 *            邮件内容
	 */
	public static int send(String[] receivers, String subject, String mailContent) {
		return send(receivers, subject, mailContent, null);
	}

	/**
	 * 批量邮件发送,添加附件
	 * 
	 * @param receivers
	 *            收件人
	 * @param subject
	 *            标题
	 * @param mailContent
	 *            邮件内容
	 * @param attachements
	 *            附件
	 */
	public static int send(String[] receivers, String subject, String mailContent, File[] attachements) {
		Properties props = new Properties();
		props.put("mail.smtp.host", smtpHost);// smtp服务器地址
		props.put("mail.smtp.auth", "true");// 需要校验

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailAccount, Password);// 登录用户名/密码
			}
		});
		session.setDebug(true);
		try {
			MimeMessage mimeMessage = new MimeMessage(session);
			mimeMessage.setFrom(new InternetAddress(fromAddress, fromName));// 发件人邮件

			InternetAddress[] toAddress = new InternetAddress[receivers.length];
			for (int i = 0; i < receivers.length; i++) {
				toAddress[i] = new InternetAddress(receivers[i]);
			}
			mimeMessage.setRecipients(Message.RecipientType.TO, toAddress);// 收件人邮件
			mimeMessage.setSubject(subject, charset);

			Multipart multipart = new MimeMultipart();
			// 正文
			MimeBodyPart body = new MimeBodyPart();
			body.setContent(mailContent, defaultMimetype + ";charset=" + charset);
			multipart.addBodyPart(body);// 发件内容
			// 附件
			if (attachements != null) {
				for (File attachement : attachements) {
					MimeBodyPart attache = new MimeBodyPart();
					attache.setDataHandler(new DataHandler(new FileDataSource(attachement)));
					attache.setFileName(MimeUtility.encodeText(attachement.getName(), charset, null));
					multipart.addBodyPart(attache);
				}
			}
			mimeMessage.setContent(multipart);
			mimeMessage.setSentDate(new Date());
			Transport.send(mimeMessage);
			System.out.println("发送成功");
			return 0;
		} catch (Exception e) {
			System.out.println("发送失败");
			e.printStackTrace();
			return 1;
		}
	}

	public static void main(String[] args) {
		// File[] file = new File[1];
		// file[0] = new File("C:/Users\\lxy\\Desktop\\aa\\中文名称test.java");
		//
		// String content = "<html><head></head><body><div align='center'> <br
		// /><table width='700' border='0' cellpadding='0' cellspacing='0'
		// bordercolor='#CEB9A4'><tr><td height='525' valign='top'
		// background='http://www.swsmu.com/images/birthdayimages/2013/card1.jpg'><table
		// width='700' border='0' cellspacing='0' cellpadding='0'> <tr> <td
		// width='150'></td> <td height='72' align='left'
		// valign='bottom'>test测试<a
		// href='http://img.1caifu.com/Upload/Product/20150202/中融-兴创31号信托贷款集合资金信托计划_48.zip'>下载测试</a></td></tr></table></td></tr></table></div><div
		// align='center'></div></body></html>";
		// MailSenderUtil.send(new String[] { "lxy.sh@aresoft.cn" }, "主题",
		// content, null);
		send("qy.sh@aresoft.cn","中文","中午");
	}

}
