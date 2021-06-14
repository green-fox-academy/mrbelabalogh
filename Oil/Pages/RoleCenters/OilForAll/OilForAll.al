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

    actions
    {
        area(Creation)
        {
            group(AddNew)
            {
                Caption = 'Add new Oil Field';

                action(CreateNewOilField)
                {
                    ApplicationArea = All;
                    Caption = 'Create new Oil Field';

                }
                action(CreateNewPetrolStation)
                {
                    ApplicationArea = All;
                    Caption = 'Create new Petrol Station';

                }
            }
        }
        area(Sections)
        {
            group(OilStats)
            {
                Caption = 'Oil Stats';
                action(OilFieldList)
                {
                    ApplicationArea = All;
                    Caption = 'To OilFieldList';
                    RunObject = Page OilFieldList;
                    RunPageMode = View;
                }
                action(PetrolStationList)
                {
                    ApplicationArea = All;
                    Caption = 'ToPetrolStationList';
                    RunObject = Page PetrolStationList;
                    RunPageMode = View;
                }
                action(OilOrderList)
                {
                    ApplicationArea = All;
                    Caption = 'ToOilOrderList';
                    RunObject = Page OilOrderList;
                    RunPageMode = View;
                }
                action(OilOrderCard)
                {
                    ApplicationArea = All;
                    Caption = 'ToOilFieldCard';
                    RunObject = report MonthlyReports;
                    RunPageMode = View;
                }
                action(PetrolStationCard)
                {
                    ApplicationArea = All;
                    Caption = 'ToPetrolStationCard';
                    RunObject = Card PetrolStationCard;
                    RunPageMode = View;
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


}
