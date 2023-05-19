# Split by space.
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        max_word_count = 0
        for words in sentences:
            word = words.split()
            word_count = len(word)
            if (word_count > max_word_count):
                max_word_count = word_count

        return max_word_count

# Do length and for loop inside max as it takes iterations.
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
            return max(len(words.split()) for words in sentences)

# Count Spaces!
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
            return max(words.count(" ") for words in sentences)+1
