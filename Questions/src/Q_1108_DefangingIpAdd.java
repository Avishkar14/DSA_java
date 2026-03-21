class Q_1108_DefangingIpAdd {
    public static String defangIPaddr(String address) {
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
            //    address = address.replace("." , "[.]");
                address = address.substring(0, i) + "[.]" + address.substring(i + 1);
                i += 3;
            }
        }
        return address;
    }
}
