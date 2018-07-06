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
//��һ��������һϵ��String�����趼�ǺϷ������֣���ת��һ��List��Ȼ�����stream()������������
//�ڶ�������������map������ÿ��Ԫ����Stringת��Integer���õ�һ���µ�����map��������һ��Function���͵Ĳ�������������ˣ�Function�Ǹ������ӿڣ����������æ˱��ʽ��
//����������������filter������������Щ�������������֣����õ�һ��������filter��������һ��Predicate���͵Ĳ�������������ˣ�Predicate�Ǹ������ӿڣ����������æ˱��ʽ��
//���Ĳ�����������distinct������ȥ���ظ������õ�һ���������Ȿ��������һ��filter������
//���岽����collect���������ս���ռ���һ��List����ȥ��collect��������һ��Collector���͵Ĳ������������ָ������ռ����ս��������������У�����򵥵��ռ���һ��List�С�����Ҳ������Collectors.toMap(e->e, e->e)�ѽ���ռ���һ��Map�У�������˼�ǣ��ѽ���յ�һ��Map������Щ�����������Ϊ������Ϊֵ��toMap������������Function���͵Ĳ������ֱ��������ɼ���ֵ��Function�Ǹ������ӿڣ��������ﶼ�æ˱��ʽ��
//����ܻ��������������List I�������˺ö�Σ�map��filter��distinct���ֱ���һ��ѭ����Ч�ʻ᲻�á�ʵ�ʲ�����ˡ���Щ������һ��Stream�ķ������ǡ�����lazy�����ģ�����󷵻����ս����collect�������ǡ�����eager�����ġ�������eager����֮ǰ��lazy�ķ�������ִ�С�
//������eager����ʱ��ǰ���lazy�����Żᱻ����ִ�С������ǹܵ���ͨʽִ�С�����ζ��ÿһ��Ԫ������ͨ����Щ�ܵ��������и�Ԫ�ء�3������������map��������3��Ȼ��ͨ��filter����������������������������ͨ��distinct������Ѿ���һ��3�ˣ���ô��ֱ�Ӷ����������û��������������3��������ʵֻ������һ��ѭ����
//��collect��������eager��������forEach��toArray��reduce�ȡ�
public class Lambda {
	public void distinctPrimary(String[] numbers)
	{
		List<String> I = Arrays.asList(numbers);
		@SuppressWarnings("deprecation")
		List<Integer> r = I.stream().map(Integer::new).filter(e->Primes.isPrime(e)).distinct().collect(Collectors.toList());
		System.out.println(r);
	}
	//��������һ��Ҳ������õ��ռ���������groupingBy��
    //����һ��String���͵����飬�ҳ��������в��ظ�����������ͳ������ִ���
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
