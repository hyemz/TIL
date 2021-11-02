package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_5635_생일 {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		//String name[] = new String [T];
//		int day[] = new int[T];
//		int month[] = new int[T];
//		int year[] = new int[T];
		String day;
		String month;
		String year;
		
		HashMap<Date, String> answer = new HashMap<>();
		Date tmp[] = new Date[T];
		// save input values
		for(int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// save each value
			
				//name[t] = st.nextToken();
				//System.out.println(name[t]);
//				day[i] = Integer.parseInt(st.nextToken());
//				month[i] = Integer.parseInt(st.nextToken());
//				year[i] = Integer.parseInt(st.nextToken());
				
				String name = st.nextToken();
				day = st.nextToken();
				month = st.nextToken();
				year = st.nextToken();
				
				
				String date = year + '-' + month + '-' + day;
				SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date result = transFormat.parse(date);
				answer.put(result, name);
				tmp[t] = result;
			
		}
		
		Arrays.sort(tmp);
//		List<Date> list = new ArrayList<>(answer.keySet());
//		Collections.sort(list, (o1, o2) -> (answer.get(o1).compareTo(answer.get(o2))));
		System.out.println(answer.get(tmp[T-1]));
		System.out.println(answer.get(tmp[0]));
		
		
	}

}
