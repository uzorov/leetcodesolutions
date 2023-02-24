import java.util.ArrayList;
import java.util.Scanner;

public class NewManhattan {


    //rectPos - Координаты диагоналей, задающих ромб, внутри которого сможет находиться бегун через t минут
    //navRectPos - Координаты диагоналей, задающих ромб, внутри которого может находиться бегун согласно данным навигатора
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");
        int t = Integer.parseInt(values[1]);
        int d = Integer.parseInt(values[1]);
        int n = Integer.parseInt(values[2]);
      
      

        int[] rectPos = new int[4];


        for (int i = 0; i < n; i++) {

            rectPos = extend(rectPos, t);

            String[] navPosition = sc.nextLine().split(" ");
            int X = Integer.parseInt(navPosition[0]), Y = Integer.parseInt(navPosition[1]);
            int[] navRectPos = extend(new int[]{X + Y, X + Y, X - Y, X - Y}, d);

            rectPos = intersect(rectPos, navRectPos);
        }



        ArrayList<Integer> answerPoints = new ArrayList<Integer>();

        for (int XplusY = rectPos[0]; XplusY <= rectPos[1]; XplusY++) {
            for (int XminusY = rectPos[2]; XminusY <= rectPos[3]; XminusY++) {
                if ((XplusY + XminusY) % 2 == 0) {
                    answerPoints.add((XplusY + XminusY) / 2);
                    answerPoints.add((XplusY - XminusY)/2);
                }
            }
        }


        System.out.println(answerPoints.size() / 2);
        for (int i = 0; i < answerPoints.size(); i+=2) {
            System.out.print(answerPoints.get(i));
            System.out.print(" ");
            System.out.println(answerPoints.get(i+1));
        }

    }


    //rectPos[0] -> Xmin + Y -> Необходимо вычесть d
//rectPos[1] -> Xmax + Y -> Необходимо прибавить d
//rectPos[2] -> Xmin - Y -> Необходимо вычесть d
//rectPos[3] -> Xmax - Y -> Необходимо прибавить d
    public static int[] extend(int[] rectPos, int d) {
        return new int[]{rectPos[0] - d, rectPos[1] + d, rectPos[2] - d, rectPos[3] + d};
    }

    public static int[] intersect(int[] rectPos, int[] navRectPos) {
        return new int[]{Math.max(rectPos[0], navRectPos[0]),
                Math.min(rectPos[1], navRectPos[1]),
                Math.max(rectPos[2], navRectPos[2]),
                Math.min(rectPos[3], navRectPos[3])
        };
    }
}
















///////////////////////////////////
///////////////////////////////////
/////////////////////////////////////




    public List<Integer> intersection(List<String> list1, List<String> list2) {
        Set<Integer> list = new HashSet<Integer>();

        for (String t : list1) {
            if (list2.contains(t)) {
                list.add(Integer.parseInt(t));
            }
        }

        return new ArrayList<Integer>(list);
    }


}


////////////////////
///////////////////////////////
/////////////////////////////////////////////////////




fun main(args: Array<String>) {

    val kidsCubes = readLine()!!.split(" ").map { it -> it.toInt() }
    val anyasCubes: HashSet<Int> = hashSetOf<Int>()
    val boryasCubes: HashSet<Int> = hashSetOf<Int>()


    for (i in 0 until kidsCubes[0]) {
        anyasCubes.add(readLine()!!.toInt())
    }
    for (i in 0 until kidsCubes[1]) {
        boryasCubes.add(readLine()!!.toInt())
    }

    val nonUnicCubes = (anyasCubes intersect boryasCubes)
    val anyasUnicCubes = (anyasCubes subtract nonUnicCubes)
    val boryasUnicCubes = (boryasCubes subtract nonUnicCubes)

    println(nonUnicCubes.size)
    println(nonUnicCubes.sorted().joinToString(" "))
    println(anyasUnicCubes.size)
    println(anyasUnicCubes.sorted().joinToString(" "))
    println(boryasUnicCubes.size)
    println((boryasUnicCubes subtract nonUnicCubes).sorted().joinToString(" "))
}




////////////////////////////////
//////////////////////////////
/////////////////////////

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int color = scanner.nextInt();
            setA.add(color);
        }

        for (int i = 0; i < m; i++) {
            int color = scanner.nextInt();
            setB.add(color);
        }


        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);


        List<Integer> intersectionList = new ArrayList<>(intersection);
        Collections.sort(intersectionList);
        System.out.println(intersectionList.size());
        for (int color : intersectionList) {
            System.out.print(color + " ");
        }
        System.out.println();


        Set<Integer> setADifference = new HashSet<>(setA);
        setADifference.removeAll(intersection);


        List<Integer> setADifferenceList = new ArrayList<>(setADifference);
        Collections.sort(setADifferenceList);
        System.out.println(setADifferenceList.size());
        for (int color : setADifferenceList) {
            System.out.print(color + " ");
        }
        System.out.println();


        Set<Integer> setBDifference = new HashSet<>(setB);
        setBDifference.removeAll(intersection);


        List<Integer> setBDifferenceList = new ArrayList<>(setBDifference);
        Collections.sort(setBDifferenceList);
        System.out.println(setBDifferenceList.size());
        for (int color : setBDifferenceList) {
            System.out.print(color + " ");
        }
    }
}
