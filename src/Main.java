public class Main {
    public static void main(String[] args) {

        String n = "6210001000";
        int isSelfDescriptive = 0;
        
        for(int i = 0; i < n.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < n.length(); j++)
            {
                if(n.charAt(j) == ((char) i+'0'))
                {
                    count++;
                }
            }
            int parsedValue = Integer.parseInt(String.valueOf(n.charAt(i)));
            if(((count == 0 & parsedValue == 0)) || count == parsedValue)
               isSelfDescriptive = 1;

            else isSelfDescriptive = 0;
        }
        System.out.println(isSelfDescriptive);
    }
}