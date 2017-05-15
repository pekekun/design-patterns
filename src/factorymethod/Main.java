package factorymethod;

import framework.*;
import idcard.*;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("山田山ヲ");
		Product card2 = factory.create("花山花子");
		Product card3 = factory.create("梅山梅子");
		card1.use();
		card2.use();
		card3.use();
	}

}
