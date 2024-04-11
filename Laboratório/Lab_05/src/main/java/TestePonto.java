import Ex1.Ponto;

public class TestePonto {
    public static void main(String[] args) {
       Ponto primeiroPonto = new Ponto();
       Ponto segundoPonto = new Ponto(400,230);

       primeiroPonto.setX(200);
       primeiroPonto.setY(200);

       Ponto outraRefSegundoPonto = segundoPonto;

       System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");

       System.out.println("Coordenadas do segundo ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

       System.out.println("\nCriação de uma segunda referência para o segundo ponto, chamada outraRefSegundoPonto \n\nExibindo  o conteúdo de todas as referências\n");

       System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");

       System.out.println("Coordenadas do segundo ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

       System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): (" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");

       System.out.println("\nAlterando as coordenadas do segundo ponto para (840,350)\n");

       System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");


       outraRefSegundoPonto.setX(840);
       outraRefSegundoPonto.setY(350);

       System.out.println("Coordenadas do segundo ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

       System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): (" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");






    }
}
