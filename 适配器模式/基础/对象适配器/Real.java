package 适配器模式.基础.对象适配器;

public class Real {

    public int getHole() {
        int holeNum = 5;
        System.out.println("我本有5个插孔");
        return holeNum;
    }
}
