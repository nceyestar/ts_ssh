import java.util.List;

import com.zj.dao.PoetDBService;
import com.zj.model.Poetries;

public class Test
{

	public static void main(String[] args)
	{
		PoetDBService pds=new PoetDBService();
		List<Poetries>m=pds.findByAuthor("李白");
		System.out.println(m.size());

	}

}
