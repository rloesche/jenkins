import hudson.model.*
def pa = new ParametersAction([
  new StringParameterValue("a", 'aaaa'),
  new StringParameterValue('b','bbbb')
])

build.addAction(pa)
