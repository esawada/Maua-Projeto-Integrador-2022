import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Explosao {
	
	private BufferedImage imagem;
	private int x, y;
	private int dura��o;
	private int anima��oTotal;
	private int linha;
	private int coluna;
	
	public Explosao(BufferedImage imagem, int x, int y) {
		
		this.imagem = imagem;
		this.x = x;
		this.y = y;
		dura��o = 40;
		linha = 0;
		coluna = 0;
		anima��oTotal = 140;
	}
	
	public void atualizar() {
		
		dura��o--;
		
		//linha = 6 - dura��o / 10;
		//System.out.println("linha");
		
	}
	
	public void pintar(Graphics2D g) {
		
		g.drawImage(imagem, x, y, x + 50, y + 50, 0, 198 * linha, 198, 198 * linha + 198, null);	
	}
	public boolean acabou() {
		if(dura��o <= 0)
			return true;
		
		return false;
		
	}
}
