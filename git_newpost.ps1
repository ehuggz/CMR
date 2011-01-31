param($message)
if ($message -eq $null)
	{echo "Error Message Parameter Required
	Use form -message 'Message'"}	
else
{
	Write-Host("")
	$symbolicref = git symbolic-ref HEAD
	$pbranch = $symbolicref.substring($symbolicref.LastIndexOf("/") +1)
	echo $pbranch
	if ($pbranch -eq "master")
		{
		echo "Error - cannot pull from master branch"
		wait 100
		exit
		}	
	$now = [DateTime]::Now
	$myDay = $now.Day.ToString()
	$myMonth = $now.Month.ToString()
	$myYear = $now.Year.ToString()
	$myHour = $now.Hour.ToString()
	$myMin = $now.Minute.ToString()

	$branch = $myDay+$myMonth+$myYear+'-'+$myHour+$myMin
	git add -A
	git commit -m $message
	git checkout Master
	git checkout -b $branch
	git pull jp master
	echo "Branch: $Branch Message: $message"
}