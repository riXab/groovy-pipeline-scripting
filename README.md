About:
------
Project to enable Configuration as a Code using Groovy Script.
------
Commits:
--------
-- Initiate project as a git to repository.
-- 




--------
Notes:
------
When working with .groovy scripts:
	-- "return this" is crucial
	-- Ok, so this is outdated. Instead of ${rootDir}, use ${workspace}, which is set by Jenkins.
		-- Also, be sure to uncheck "Lightweight checkout" in the pipeline job's configuration, or else your .groovy script(s) will not be downloaded from SCM.
		OR
		-- You have to do checkout scm (or some other way of checkouting code from SCM) before doing load.
	-- I found a caveat -- when running 2 concurrent instances of the same job, Jenkins will append @2 to the workspace name... however, it does not to so for the @script directory, meaning that ${workspace}@script/Example.Groovy will not work when running concurrent builds.
	

------
		
