package zookeeper;

public class Program {

	public static void main(String[] args) {
		Gorilla joe = new Gorilla();
		
		
		joe.throwSomething();
		joe.throwSomething();
		joe.throwSomething();
		
		joe.eatBananas();
		joe.eatBananas();
		
		joe.climb();
		
		
		
		//attack three towns,eat 2 humans,and fly twice
		Bats pete = new Bats();
		for (int i=0;i<3;i++) {
			pete.attackTown();
		}
		for (int i = 0;i<2;i++) {
			pete.eathumans();
		}
		for (int i = 0;i<2;i++) {
			pete.fly();
		}
	}
};
