package interfaceStudy;

public class DiamondAmbiguity implements Diamond1, Diamond2
{
	public static void main(String[] args) {
		DiamondAmbiguity d=new DiamondAmbiguity();
		d.money();
	}

	@Override
	public void money()
	{

		Diamond1.super.money();
		Diamond2.super.money();
	
	}

}
