class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] arr=title.split(" "); 
        for (int i=0;i<arr.length;i++) {
            String str=arr[i];
            if (str.length()<=2) {
                sb.append(str.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1).toLowerCase());
            }
            if (i!=arr.length-1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
