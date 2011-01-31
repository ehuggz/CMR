param($message)
if ($message -eq $null)
	{
	echo "Error Message Parameter Required
	Use form -message 'Message'"
	}	
else
{
	Write-Host("")
	$symbolicref = git symbolic-ref HEAD
	$pbranch = $symbolicref.substring($symbolicref.LastIndexOf("/") +1)
	echo $pbranch
	if ($pbranch -eq "master")
		{
		echo "Error - cannot push from master branch"
		exit
		}	
}
     git add -A
     git commit -m $message
     git push origin $pbranch
