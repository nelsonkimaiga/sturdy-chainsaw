package com.example.springmailer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailClientTest {
 
    private GreenMail smtpServer;
 
    @Before
    public void setUp() throws Exception {
        smtpServer = new GreenMail(new ServerSetup(25, null, "smtp"));
        smtpServer.start();
    }
 
    @After
    public void tearDown() throws Exception {
        smtpServer.stop();
    }
     
}
