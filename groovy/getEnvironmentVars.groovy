import hudson.model.*

def x = build.getEnvironment(listener).get('x')

println x
