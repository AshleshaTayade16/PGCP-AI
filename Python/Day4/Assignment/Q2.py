# Q.2.In English, present participle is formed by adding suffix -ing to infinite form: go -> going. A simple set of rules can be given as follows:
#  a. If the verb ends in e, drop the e and add ing
#  b. If the verb ends in ie, change ie to y and add ing
# Write a function make_ing_form() which accepts a list of verbs and returns a dictionary with verb : present participle

list =input('Enter the list: ').split(' ')
dict ={}
def make_ing_form(list):
    for verb in list:
        if verb.endswith('ie'):
            dict[verb] = verb[0:len(verb)-2]+'y'+'ing'
        elif verb.endswith('e'):
            dict[verb] = verb[0:len(verb)-1]+'ing'
        else:
            dict[verb]=verb+'ing'

make_ing_form(list)
print(dict)