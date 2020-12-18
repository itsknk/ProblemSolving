func lengthOfLastWord(s string) int {
    length := 0
    if (len(s) == 0){
        return length
    }
    s = strings.TrimSpace(s)
    for i:=len(s)-1; i>=0; i--{
        if s[i] == ' '{
            break
        }
        length++
    }
    return length
}
