func longestCommonPrefix(strs []string) string {
    if len(strs) == 0{
        return ""
    }
    var prefix string = strs[0]
    for i:=0; i<len(strs); i++{
        for strings.Index(strs[i], prefix)!=0{
            prefix = prefix[0:(len(prefix)-1)]
        }
    }
    return prefix
}
