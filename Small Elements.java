import java.util.*;

class  practice {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = s.nextInt();
        }
        int x = s.nextInt();
        ArrayList<Integer> ans = smallNums(a, x);
        
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + ", ");
        }
        
    }
    
    public static ArrayList<Integer> smallNums(int a[], int x){
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < a.length; i++){
            if(a[i] < x)
            ans.add(a[i]);
        }
        return ans;
    }
}
