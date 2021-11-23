package ProjectWithSolutions.Lab4.Lab41;
public class Lab4_1 {
    public static void main(String[] args) {
        Figure figure1 = new Parallelepiped(3,4, 5);
        Figure figure2 = new Pyramid(3,4,6);
        Figure figure3 = new Tetrahedron(3);
        Figure figure4 = new Globe(5);
        Figure[] array = new Figure[4];
        array[0] = figure1;
        array[1] = figure2;
        array[2] = figure3;
        array[3] = figure4;
        for(Figure a : array){
            System.out.println(a.volume());
        }
    }
}


