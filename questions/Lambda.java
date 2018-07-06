package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class Primes
{
	public static boolean isPrime(int n){
	          if (n <= 3) 
                return n > 1;
		      else if (n%2==0||n%3==0)
                return false;
	          else{
	        	  for(int i=2;i<=Math.sqrt(n);i++){
                              if(n%i == 0)
	                      return false;
	                }
           }
	           return true;
	       }
	
}
//第一步：传入一系列String（假设都是合法的数字），转成一个List，然后调用stream()方法生成流。
//第二步：调用流的map方法把每个元素由String转成Integer，得到一个新的流。map方法接受一个Function类型的参数，上面介绍了，Function是个函数接口，所以这里用λ表达式。
//第三步：调用流的filter方法，过滤那些不是素数的数字，并得到一个新流。filter方法接受一个Predicate类型的参数，上面介绍了，Predicate是个函数接口，所以这里用λ表达式。
//第四步：调用流的distinct方法，去掉重复，并得到一个新流。这本质上是另一个filter操作。
//第五步：用collect方法将最终结果收集到一个List里面去。collect方法接受一个Collector类型的参数，这个参数指明如何收集最终结果。在这个例子中，结果简单地收集到一个List中。我们也可以用Collectors.toMap(e->e, e->e)把结果收集到一个Map中，它的意思是：把结果收到一个Map，用这些素数自身既作为键又作为值。toMap方法接受两个Function类型的参数，分别用以生成键和值，Function是个函数接口，所以这里都用λ表达式。
//你可能会觉得在这个例子里，List I被迭代了好多次，map，filter，distinct都分别是一次循环，效率会不好。实际并非如此。这些返回另一个Stream的方法都是“懒（lazy）”的，而最后返回最终结果的collect方法则是“急（eager）”的。在遇到eager方法之前，lazy的方法不会执行。
//当遇到eager方法时，前面的lazy方法才会被依次执行。而且是管道贯通式执行。这意味着每一个元素依次通过这些管道。例如有个元素“3”，首先它被map成整数型3；然后通过filter，发现是素数，被保留下来；又通过distinct，如果已经有一个3了，那么就直接丢弃，如果还没有则保留。这样，3个操作其实只经过了一次循环。
//除collect外其它的eager操作还有forEach，toArray，reduce等。
public class Lambda {
	public void distinctPrimary(String[] numbers)
	{
		List<String> I = Arrays.asList(numbers);
		@SuppressWarnings("deprecation")
		List<Integer> r = I.stream().map(Integer::new).filter(e->Primes.isPrime(e)).distinct().collect(Collectors.toList());
		System.out.println(r);
	}
	//下面来看一下也许是最常用的收集器方法，groupingBy：
    //给出一个String类型的数组，找出其中所有不重复的素数，并统计其出现次数
@SuppressWarnings("deprecation")
public void primaryOccurrence(String[] numbers)
{
	List<String> I = Arrays.asList(numbers);
	Map<Object, IntSummaryStatistics> t =new HashMap<>();
	 t =I.stream().map(Integer::new).filter(e->Primes.isPrime(e)).collect(Collectors.groupingBy(p->p,Collectors.summarizingInt(p->1)));
	Map<Integer,Integer> f = I.stream().map(Integer::new).filter(e->Primes.isPrime(e)).collect(Collectors.groupingBy(p->p,Collectors.summingInt(p->1)));
	System.out.println(t);
	System.out.println(f);
}
public void distinctPrimarySum(String [] numbers)
{

	List<String> I = Arrays.asList(numbers);
	@SuppressWarnings("deprecation")
	int sum = I.stream().map(Integer::new).filter(e->Primes.isPrime(e)).distinct().reduce(0, (x,y)->x+y);
	System.out.println(sum);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b[] = new String[100000];
		for(int i=0;i<100000;i++)
		{
			b[i]=String.valueOf(i);
		}
		Lambda l = new Lambda();
//		l.distinctPrimary(b);
//		l.primaryOccurrence(b);
		l.distinctPrimarySum(b);

	}

}
