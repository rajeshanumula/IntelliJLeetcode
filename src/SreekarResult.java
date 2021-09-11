public class SreekarResult {
    public static String validatePhoneNumberFormat(String address){
        String[] split=address.split(":");
        switch (split.length){
            case 1:
                if(checkIdentifier(split[0])) return "SMS";
                else return "INVALID_ADDRESS";

            case 2:
                if(split[0].equals("whatsapp")){
                    if(checkIdentifier(split[1])) return "WHATSAPP";
                    else return "INVALID_ADDRESS";
                }
                else  if(split[0].equals("messenger")){
                    if(checkIdentifier(split[1])) return "MESSENGER";
                    else return "INVALID_ADDRESS";
                }
                else if(split[0].equals("wechat")){
                    if(checkIdentifierWeChat(split[1])) return "WECHAT";
                    else return "INVALID_ADDRESS";
                }
                break;

            default:
                return "INVALID_ADDRESS";
        }
        return "INVALID_ADDRESS";
    }
    public static boolean checkIdentifier(String id){
        if(id.charAt(0)=='0' || id.length()>15) return false;
        id=id.substring(1,id.length());
        for(char ch:id.toCharArray()){
            if(!Character.isDigit(ch) ) return false;
        }
        return true;
    }
    public static boolean checkIdentifierWeChat(String id){
        if(id.length()>251 || id.length()<1) return false;
        for(char ch:id.toCharArray()){
            if(!Character.isLetterOrDigit(ch) || ch!='+' || ch!='-' || ch!='_' || ch!='@' || ch!='.') return false;
        }
        return true;
    }
    public static void main(String[] args){
//        System.out.println(validatePhoneNumberFormat("whatsapp:155555555555"));
//        System.out.println(validatePhoneNumberFormat("wechat:identifier:ghke83772"));
//        System.out.println(validatePhoneNumberFormat("wechat:ghke83772"));
//        System.out.println(validatePhoneNumberFormat("whatsapp:+155555555555"));
       // System.out.println(validatePhoneNumberFormat("messenger:+14155552671"));
//        System.out.println(validatePhoneNumberFormat("messenger:this_is_not_E164_number"));
//        System.out.println(validatePhoneNumberFormat("whatsapp:155555555555"));
//        System.out.println(validatePhoneNumberFormat("whatsapp:155555555555"));
//        System.out.println(validatePhoneNumberFormat("whatsapp:155555555555"));
        System.out.println(validatePhoneNumberFormat("wechat:d49c33580hrn76fmk31tyytjbqjptaylqwlp7ye5j4xqkucdzboaz984t4sxbitn6dqpubg906zwnt3huk9v69xuuziq4ogkbcbsckd5rhjn3blx1at8gs2r0s6gnhidfqdy135l0lkttw3ibu9toxoluaudlvdrwge36frqgbrs5jyis7meb1xbfk@y@mp6dbmlsqe87gf18evyhsax19dummxb2sf8sg90lzc507plnvhiuswdqda0"));
    }
}
