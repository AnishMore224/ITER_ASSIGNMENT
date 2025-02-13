class Chapter:
    def __init__(self, title, page_count):
        self.title = title
        self.page_count = page_count

class Book:
    def __init__(self):
        self.chapters = []

    def add_chapter(self, chapter):
        self.chapters.append(chapter)

    def total_page_count(self):
        return sum(chapter.page_count for chapter in self.chapters)

book = Book()
book.add_chapter(Chapter("Chapter 1: Introduction", 10))
book.add_chapter(Chapter("Chapter 2: Methods", 20))
book.add_chapter(Chapter("Chapter 3: Results", 30))

print("Total page count of the book:", book.total_page_count())

'''
Output---
Total page count of the book: 60
'''