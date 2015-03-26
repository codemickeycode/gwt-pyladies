print "Hello World!"

def add(x,y):
	return x + y 

list_comprehension = [x+10 for x in range(0,10)]
print list_comprehension

class Pylady:
	def __init__(self,name):
		self.name = name

	def sayhi(self):
		print "Hi! I'm " + self.name


stef = Pylady("stef")
stef.sayhi()
