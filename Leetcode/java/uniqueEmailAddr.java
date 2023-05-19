class uniqueEmailAddr {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique_emails = new HashSet();
        for(String email : emails){
            int split_location = email.indexOf("@");
            String localname = email.substring(0, split_location);
            String domainname = email.substring(split_location);
            
            if(localname.contains("+")){
                int plus_location = localname.indexOf("+");
                localname = localname.substring(0, plus_location);
            }
            localname = localname.replaceAll("\\.", "");
            String newname = localname + domainname;
            unique_emails.add(newname);
        }
        return unique_emails.size();
    }
}
