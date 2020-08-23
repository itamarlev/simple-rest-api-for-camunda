This is a simple REST api with two endpoints:

GET - /greeting?name=Itamar
the name is optional. if not given Hadar is the default.
returns the name with an Id in a JSON format.

POST - /calculateNameLength
expecting a json body of this strtucture:
{
    "id" : "3",
    "content": "Dor"
}
will return the length of the mame given in the content parameter.

