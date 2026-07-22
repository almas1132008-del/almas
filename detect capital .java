class Solution {
public:
    bool detectCapitalUse(string word) {
        int capitalCount = 0;
        for (char c : word) {
            if (isupper(c)) {
                capitalCount++;
            }
        }
        
        return capitalCount == 0 
            || capitalCount == (int)word.length() 
            || (capitalCount == 1 && isupper(word[0]));
    }
};