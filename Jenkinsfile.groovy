import hudson.plugins.git.*;

def scm = new GitSCM("git@github.com:riXab/pipeline-groovy-scripting.git")
scm.branches = [new BranchSpec("*/develop")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "Jenkinsfile")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "New Job")
job.definition = flowDefinition




//def scriptApproval = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
//scriptApproval.approveSignature('method hudson.plugins.git.BranchSpec getName')
//scriptApproval.approveSignature('method hudson.plugins.git.GitSCM getBranches')

//and now I can use "${scm.branches[0].name}" in my Jenkinsfile