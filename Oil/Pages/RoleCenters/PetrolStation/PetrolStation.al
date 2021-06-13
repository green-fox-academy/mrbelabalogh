page 50110 PetrolStation
{

    PageType = RoleCenter;
    Caption = 'PetrolStation Role Center';

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
profile PetrolStationProfile
{
    Description = 'A new profile for the role center exercise';
    Caption = 'GFA Profile';
    ProfileDescription = 'new profile';
    RoleCenter = PetrolStation;
    Enabled = true;
    Promoted = true;
}

pagecustomization MyCustomization2 customizes "Customer List"
{
    layout
    {
        modify(Name)
        {
            Visible = false;
        }
    }

    actions
    {
        area(Navigation)
        {
            action(OilOrderList)
            {
                ApplicationArea = All;
                Caption = 'To OilOrderList';
                RunObject = Page OilOrderList;
                                RunPageMode = View;
            }
        }

        area(Navigation)
        {
            action(OilOrderCard)
            {
                ApplicationArea = All;
                Caption = 'ToOilOrderCard';
                RunObject = CardPageId 50108;
                RunPageMode = View; //??

            }
        }   
}
