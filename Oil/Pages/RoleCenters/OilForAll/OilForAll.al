page 50109 OilForAll
{

    PageType = RoleCenter;
    Caption = 'OilForAll Role Center';

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
profile OilForAllProfile
{
    Description = 'A new profile for the role center exercise';
    Caption = 'GFA Profile';
    ProfileDescription = 'new profile';
    RoleCenter = OilForAll;
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

    actions
    {
        area(Navigation)
        {
            action(OilFieldList)
            {
                ApplicationArea = All;
                Caption = 'To OilFieldList';
                RunObject = Page OilFieldList;
                                RunPageMode = View;
            }
        }

        area(Navigation)
        {
            action(PetrolStationList)
            {
                ApplicationArea = All;
                Caption = 'ToPetrolStationList';
                RunObject = Page PetrolStationList;
                                RunPageMode = View;
            }
        }   

        area(Navigation)
        {
            action(OilOrderList)
            {
                ApplicationArea = All;
                Caption = 'ToOilOrderList';
                RunObject = Page OilOrderList;
                                RunPageMode = View;
            }
        } 

        area(Navigation)
        {
            action(OilOrderList)
            {
                ApplicationArea = All;
                Caption = 'ToOilFieldCard';
                RunObject = Card OilFieldCard;
                RunPageMode = View;
            }
        } 

        area(Navigation)
        {
            action(OilOrderList)
            {
                ApplicationArea = All;
                Caption = 'ToPetrolStationCard';
                RunObject = Card PetrolStationCard;
                RunPageMode = View;
            }
        } 
    }
}
