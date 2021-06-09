page 50125 MyRoleCenter
{

    PageType = RoleCenter;
    Caption = 'My Role Center';

    layout
    {
        area(RoleCenter)
        {
            group(Group1)
            {
                part(Part1; YourHeadLine)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}
profile MyProfile
{
    Description = 'A new profile for the role center exercise';
    Caption = 'GFA Profile';
    ProfileDescription = 'new profile';
    RoleCenter = MyRoleCenter;
    Enabled = true;
    Promoted = true;
}

pagecustomization MyCustomization customizes "Customer List"
{
    layout
    {
        modify(Name)
        {
            Visible = false;
        }
    }
}
