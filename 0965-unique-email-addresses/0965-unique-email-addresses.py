class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:

        s = set()

        for email in emails:
            local , domain = email.split("@")
            local = local.replace(".","")

            email = local + "@" + domain
            
            if "+" not in email:
                s.add(email)
                continue
            final_email = email[:email.find("+")] + email[email.find("@"):]
            s.add(final_email)
        return len(s)