package 工厂模式.抽象工厂.IFactory;

import 工厂模式.抽象工厂.IFood.IDrink.IDrink;
import 工厂模式.抽象工厂.IFood.INoodle.INoodle;

public abstract class IFactory {
    public abstract IDrink drink();
    public abstract INoodle noodle();
}
