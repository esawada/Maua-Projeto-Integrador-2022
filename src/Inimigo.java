import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Inimigo{
	
	private BufferedImage desenho;
	private int x;
	private int y;
	private int velocidade;
	private int dire��o;
	
	
	public Inimigo(BufferedImage imagem, int inicioX, int inicioY, int dire��o){
		
		this.desenho = imagem;
		this.x = inicioX;
		this.y = inicioY;
		this.dire��o = dire��o;
		this.velocidade = 4;
	}
	
	public void atualizar() {
		
		x += velocidade * dire��o;
		
	}
	
	
	
	public void trocaDire��o() {
		 dire��o = dire��o * -1;
		 y +=25;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void pintar(Graphics2D g) {
		
		g.drawImage(desenho, x, y, x + 50, y + 50, 0, 0, desenho.getWidth(), desenho.getHeight(), null );
		
	}

	public int getTam() {
		
		return 50;
	}

}