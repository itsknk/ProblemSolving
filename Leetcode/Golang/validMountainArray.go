func validMountainArray(arr []int) bool {
    i:=0
    for i<len(arr) && i+1 < len(arr) && arr[i] < arr[i+1]{
        i++
    }
    if i == 0 || i+1 >= len(arr){
        return false
    }
    for i<len(arr) && i+1 < len(arr){
        if arr[i] <= arr[i+1]{
            return false
        }
        i++
    }
    return true
}
