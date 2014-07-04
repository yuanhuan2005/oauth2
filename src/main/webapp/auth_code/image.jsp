<%@ page contentType="image/jpeg" import="java.awt.*, java.awt.image.*,java.util.*,javax.imageio.*" %> 

<%! 
	Color getRandColor(int fc,int bc) 
	{ 
		Random random = new Random(); 
		fc = (fc>255)?255:fc;
		bc = (bc>255)?255:bc;
		int r=fc+random.nextInt(bc-fc); 
		int g=fc+random.nextInt(bc-fc); 
		int b=fc+random.nextInt(bc-fc); 
		return new Color(r,g,b); 
	} 
%> 

<% 
	response.setHeader("Pragma","No-cache"); 
	response.setHeader("Cache-Control","no-cache"); 
	response.setDateHeader("Expires", 0); 
	int width=60, height=20; 
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
	Graphics g = image.getGraphics(); 
	Random random = new Random(); 
	g.setColor(getRandColor(200,250)); 
	g.fillRect(0, 0, width, height); 
	g.setFont(new Font("Times New Roman",Font.PLAIN,18)); 
	g.setColor(getRandColor(160,200)); 
	for (int i=0;i<155;i++) 
	{ 
		int x = random.nextInt(width); 
		int y = random.nextInt(height); 
		int xl = random.nextInt(12); 
		int yl = random.nextInt(12); 
		g.drawLine(x,y,x+xl,y+yl); 
	}
	
	String sRand=""; 
	String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	int strLen = str.length();
	for (int i=0;i<4;i++){ 
	    String rand=String.valueOf(str.charAt(random.nextInt(strLen)));
		//String rand=String.valueOf(random.nextInt(10)); 
		sRand+=rand; 
		g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110))); 
		g.drawString(rand,13*i+6,16); 
	} 
	
	sRand = sRand.toLowerCase();
	System.out.println("sRand="+sRand);
	
	session.setAttribute("rand",sRand); 
	g.dispose(); 
	ImageIO.write(image, "JPEG", response.getOutputStream());
	out.clear();  
    out = pageContext.pushBody();  
%>