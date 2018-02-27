package 适配器模式.基础.对象适配器;

public class RealAdapter implements Client {

    private static final int HOLENUM = 3;

    private Real real;

    public RealAdapter(Real real) {
        this.real = real;
    }

    @Override
    public int getHole() {
        if (null != real) {
            System.out.println("适配前孔数为：" + real.getHole());
            System.out.println("适配后孔数为：" + HOLENUM);
            return HOLENUM;
        } else {
            System.out.println("适配失败..");
            return -1;
        }
    }
}
